package com.inmoment.model;

public class Status {
    private String status;
    private Long timeUsed;
    private Long timeRemaining;
    private Integer currentPageIndex;
    private Integer currentTermIndex;
    private String currentTerm;
    private String currentTermDefinition;
    private Boolean hasNextPage;
    private Boolean hasNextTerm;
    private Boolean hasPreviousPage;
    private Boolean hasPreviousTerm;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
    }

    public Long getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(Long timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public Integer getCurrentPageIndex() {
        return currentPageIndex;
    }

    public void setCurrentPageIndex(Integer currentPageIndex) {
        this.currentPageIndex = currentPageIndex;
    }

    public Integer getCurrentTermIndex() {
        return currentTermIndex;
    }

    public void setCurrentTermIndex(Integer currentTermIndex) {
        this.currentTermIndex = currentTermIndex;
    }

    public String getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(String currentTerm) {
        this.currentTerm = currentTerm;
    }

    public String getCurrentTermDefinition() {
        return currentTermDefinition;
    }

    public void setCurrentTermDefinition(String currentTermDefinition) {
        this.currentTermDefinition = currentTermDefinition;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean getHasNextTerm() {
        return hasNextTerm;
    }

    public void setHasNextTerm(Boolean hasNextTerm) {
        this.hasNextTerm = hasNextTerm;
    }

    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public Boolean getHasPreviousTerm() {
        return hasPreviousTerm;
    }

    public void setHasPreviousTerm(Boolean hasPreviousTerm) {
        this.hasPreviousTerm = hasPreviousTerm;
    }
}
