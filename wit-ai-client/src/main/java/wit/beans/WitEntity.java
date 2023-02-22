package wit.beans;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class WitEntity {
	@Key
    private String id;
    @Key
    private List<WitValue> values = new ArrayList<>();
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public WitEntity withId(String id) {
        this.id = id;
        return this;
    }
    
    public List<WitValue> getValues() {
        return values;
    }
    
    public void setValues(List<WitValue> values) {
        this.values = values;
    }

    public WitEntity withValues(List<WitValue> values) {
        this.values = values;
        return this;
    }
}