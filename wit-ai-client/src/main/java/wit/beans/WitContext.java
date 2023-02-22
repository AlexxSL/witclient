package wit.beans;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

import json.FlexibleMap;

public class WitContext extends FlexibleMap {
	@Key
    private List<String> state = new ArrayList<String>();
    @Key
    private String referenceTime;
    @Key
    private String timezone;
    @Key
    private List<WitEntity> entities = new ArrayList<WitEntity>();
    
    public List<String> getState() {
        return state;
    }
    
    public void setState(List<String> state) {
        this.state = state;
    }

    public WitContext withState(List<String> state) {
        this.state = state;
        return this;
    }
    
    public String getReferenceTime() {
        return referenceTime;
    }
    
    public void setReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime;
    }

    public WitContext withReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime;
        return this;
    }
    
    public String getTimezone() {
        return timezone;
    }
    
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public WitContext withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    public List<WitEntity> getEntities() {
        return entities;
    }
    
    public void setEntities(List<WitEntity> entities) {
        this.entities = entities;
    }

    public WitContext withEntities(List<WitEntity> entities) {
        this.entities = entities;
        return this;
    }
    
    public WitContext merge(List<WitEntity> resolved_entities){
        resolved_entities.stream().forEach(re -> {
                entities.removeIf(e -> e.getId().equals(re.getId()));
                entities.add(re);
            }
        );
        return this;
    }
}