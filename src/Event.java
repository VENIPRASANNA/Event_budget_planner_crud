public class Event {
    private int id;
    private String eventName;
    private String date;
    private String venue;
    private double budget;

    public Event(String eventName, String date, String venue, double budget) {
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
        this.budget = budget;
    }

    public Event(int id, String eventName, String date, String venue, double budget) {
        this.id = id;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
        this.budget = budget;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
