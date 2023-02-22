package wit.beans;

import com.google.api.client.util.Key;

public class ConverseResponse {
	@Key
    private String type;
    @Key
    private String action;
    @Key
    private String msg;
    @Key
    private EntityMap entities = new EntityMap();
    @Key
    private Double confidence;
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public ConverseResponse withType(String type) {
        this.type = type;
        return this;
    }
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public ConverseResponse withAction(String action) {
        this.action = action;
        return this;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ConverseResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }
    
    public EntityMap getEntities() {
        return entities;
    }
    
    public void setEntities(EntityMap entities) {
        this.entities = entities;
    }

    public ConverseResponse withEntities(EntityMap entities) {
        this.entities = entities;
        return this;
    }
    
    public Double getConfidence() {
        return confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public ConverseResponse withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
}