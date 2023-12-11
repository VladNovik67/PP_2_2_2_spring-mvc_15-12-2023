package web.model;


public class Cars {


    private String company;

    private String model;

    private String series;

    public Cars() {
    }

    public Cars(String company, String model, String series) {
        this.company = company;
        this.model = model;
        this.series = series;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}

