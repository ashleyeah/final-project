package com.example.finalproject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.TextView;

        import com.android.volley.Request;
        import com.android.volley.RequestQueue;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.StringRequest;
        import com.android.volley.toolbox.Volley;

        import org.w3c.dom.Document;
        import org.xml.sax.InputSource;
        import org.xml.sax.SAXException;

        import java.io.IOException;
        import java.io.StringReader;

        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.DocumentBuilderFactory;
        import javax.xml.parsers.ParserConfigurationException;

public class CourseInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);

        final TextView avail = findViewById(R.id.avail);
        final TextView info = findViewById(R.id.info);
        final TextView desc = findViewById(R.id.desc);
        final TextView ch = findViewById(R.id.ch);
// ...

// Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://courses.illinois.edu/cisapp/explorer/schedule/2020/spring/" +
                getIntent().getStringExtra("subjectCode") + "/" +
                getIntent().getStringExtra("courseNumber") + ".xml";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        DocumentBuilder builder = null;
                        try {
                            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                        } catch (ParserConfigurationException e) {
                            e.printStackTrace();
                        }
                        InputSource src = new InputSource();
                        src.setCharacterStream(new StringReader(response));

                        Document doc = null;
                        try {
                            doc = builder.parse(src);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (SAXException e) {
                            e.printStackTrace();
                        }
                        String label = doc.getElementsByTagName("label").item(0).getTextContent();
                        String description = doc.getElementsByTagName("description").item(0).getTextContent();
                        String creditHours = doc.getElementsByTagName("creditHours").item(0).getTextContent();
                        info.setText("Course Name: " + label);
                        desc.setText("Description: " + description);
                        ch.setText("Credit Hours: " + creditHours);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                avail.setText("This course is not available for Spring 2020 semester");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}

