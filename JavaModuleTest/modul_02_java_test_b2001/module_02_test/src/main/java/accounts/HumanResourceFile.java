package accounts;

public class HumanResourceFile {
    public static void main(String[] args) {

        workDayFile("Navid", "Khan", "QA Engineer", 50.00);
        workDayFile("Ferhan", "Chan", "DevOps", 70.00);
        workDayFile("Michael", "Dhan", "CSR", 20.00);
        workDayFile("Shawn", "Shan", "Systems Admin", 40.00);
        workDayFile("Eashan", "Rhan", "CEOr", 100.00);
        workDayFile("Jahidul", "Than", "QA Engineer", 50.00);
        workDayFile("Nusrat", "Qhan", "QA Engineer", 50.00);
        workDayFile("Anika", "Zhan", "QA Engineer", 50.00);

    }

    public static void workDayFile(String firstname, String lastName, String title, double salary){
        double grossyearly = (salary*40)*52;
        double grossmonthly = (salary*40)*4;
        double netIncomeYearly = grossyearly*0.65;
        double netIncomeMonthly = grossmonthly*0.65;

        System.out.println(firstname + " " + lastName + " " + title + " " + grossyearly);
        System.out.println(grossmonthly);
        System.out.println(netIncomeMonthly);
        System.out.println((netIncomeYearly));
    }
}
