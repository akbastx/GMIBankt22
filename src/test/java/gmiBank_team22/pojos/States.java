package gmiBank_team22.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;
@JsonIgnoreProperties(ignoreUnknown = true)
public class States {
    private Integer id;
    private String name;
    private Country tpcountry;

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


    public Country getTpcountry() {
        return tpcountry;
    }


    public void setTpcountry(Country tpcountry) {
        this.tpcountry = tpcountry;
    }


    public States() {
    }
    public States(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public States(String name, Country tpcountry) {
        this.name = name;
        this.tpcountry = tpcountry;
    }

    public States(Integer id, String name, Country tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }



}
