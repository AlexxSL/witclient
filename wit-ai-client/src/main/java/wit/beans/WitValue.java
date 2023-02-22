package wit.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.util.Key;

public class WitValue {
	@Key
    private String value;
    @Key
    private List<String> expressions = new ArrayList<>();
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public WitValue withValue(String value) {
        this.value = value;
        return this;
    }
    
    public List<String> getExpressions() {
        return expressions;
    }
    
    public void setExpressions(List<String> expressions) {
        this.expressions = expressions;
    }

    public WitValue withExpressions(List<String> expressions) {
        this.expressions = expressions;
        return this;
    }

    public WitValue withExpressions(String... expressions){
        return withExpressions(Arrays.asList(expressions));
    }
}