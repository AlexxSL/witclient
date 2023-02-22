package wit.beans;

import com.google.api.client.util.Key;

public class Outcome {
	@Key("_text")
    private String text;
    @Key
    private String intent;
    @Key
    private EntityMap entities = new EntityMap();
    @Key
    private Double confidence;
    
    public String getText() {
    	return text;
    }
    
    public void setText(String Text) {
    	this.text = Text;
    }
    
    public Outcome withText(String Text) {
    	this.text = Text;
    	return this;
    }
    
    public String getIntent() {
    	return intent;
    }
    
    public void setIntent(String intent) {
    	this.intent = intent;
    }
    
    public Outcome withIntent(String intent) {
    	this.intent = intent;
    	return this;
    }
    
    public EntityMap getEntities() {
    	return entities;
    }
    
    public void setEntities(EntityMap entities) {
        this.entities = entities;
    }

    public Outcome withEntities(EntityMap entities) {
        this.entities = entities;
        return this;
    }
    
    public Double getConfidence() {
    	return confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Outcome withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
}