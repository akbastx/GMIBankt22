package gmiBank_team22.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private Integer id;

    private String name;

    private Object tpcountry;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Object getTpcountry() {
        return tpcountry;
    }


    public void setTpcountry(Object tpcountry) {
        this.tpcountry = tpcountry;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public States() {
    }
    public States(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public States(String name, Object tpcountry) {
        this.name = name;
        this.tpcountry = tpcountry;
    }

    public States(Integer id, String name, Object tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }


    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("tpcountry", tpcountry).append("additionalProperties", additionalProperties).toString();
    }

}
