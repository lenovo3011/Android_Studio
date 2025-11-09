package airestapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class Service_AI {

    private  Client client =null;
    private final String aiModel = "gemini-2.5-flash";

    
    public Service_AI (@Value ("${gemini.api.key}") String apiKey) {
    	this.client = Client.builder().apiKey(apiKey).build();
    }
    
    

    public String genAI(String prompt) {
        try {
            GenerateContentResponse response = client.models
                    .generateContent(aiModel, prompt, null);
            return response.text();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error while generating AI response: " + e.getMessage();
        }
    }
}
