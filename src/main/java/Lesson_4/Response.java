package Lesson_4;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.transform.Result;

@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "results",
            "offset",
            "number",
            "totalResults"
    })

    public class Response {

        @JsonProperty("results")
        private List<Result> results = new ArrayList<Result>();
        @JsonProperty("offset")
        private Integer offset;
        @JsonProperty("number")
        private Integer number;
        @JsonProperty("totalResults")
        private Integer totalResults;

        @JsonProperty("results")
        public List<Result> getResults() {
            return results;
        }

        @JsonProperty("results")
        public void setResults(List<Result> results) {
            this.results = results;
        }

        @JsonProperty("offset")
        public Integer getOffset() {
            return offset;
        }

        @JsonProperty("offset")
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        @JsonProperty("number")
        public Integer getNumber() {
            return number;
        }

        @JsonProperty("number")
        public void setNumber(Integer number) {
            this.number = number;
        }

        @JsonProperty("totalResults")
        public Integer getTotalResults() {
            return totalResults;
        }

        @JsonProperty("totalResults")
        public void setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
        }

    }
