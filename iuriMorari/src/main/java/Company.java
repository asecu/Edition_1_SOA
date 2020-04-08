public class Company {
    private String companyName;
    private Boolean companyMember;

    public Company(String companyName, Boolean companyMember) {
        this.companyName = companyName;
        this.companyMember = companyMember;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyMember=" + companyMember +
                '}';
    }
}
