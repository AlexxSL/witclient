package wit.beans;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class GetIntentViaTextResponse {
	@Key
    private String msgId;
    @Key("_text")
    private String text;
    @Key
    private List<Outcome> outcomes = new ArrayList<Outcome>();
    
    public String getMsgId() {
    	return msgId;
    }
    
    public void setMsgId(String msgId) {
    	this.msgId = msgId;
    }
    
    public GetIntentViaTextResponse withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    
    public String getText() {
    	return text;
    }
    
    public void setText(String Text) {
        this.text = Text;
    }

    public GetIntentViaTextResponse withText(String Text) {
        this.text = Text;
        return this;
    }
    
    public List<Outcome> getOutcomes() {
        return outcomes;
    }
    
    public void setOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    public GetIntentViaTextResponse withOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
        return this;
    }
}