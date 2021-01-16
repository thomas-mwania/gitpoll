package com.demo.gitpoll.service.dto.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"total_count", "incomplete_results", "items"})
public class RepoResponseDTO implements Serializable {
    @JsonProperty("total_count")
    private Long totalCount;
    @JsonProperty("incomplete_results")
    private boolean incompleteResults;
    @JsonProperty("items")
    private List<Item> items = null;
    private final static long serialVersionUID = 8083303327694922558L;

    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("incomplete_results")
    public boolean isIncompleteResults() {
        return incompleteResults;
    }

    @JsonProperty("incomplete_results")
    public void setIncompleteResults(boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
