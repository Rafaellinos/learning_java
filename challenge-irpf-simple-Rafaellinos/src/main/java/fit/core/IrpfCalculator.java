package fit.core;

public class IrpfCalculator {

    public static double calculatePercentage(double value, double percentage) {
        return value - ((value * percentage)/100);
    }

    public static double calculateBaseSalary(double totalSalary) {
        return calculatePercentage(totalSalary, 11);
    }

    public static double calculateExemption() {
        return 1903.98;
    }

    public static double calculateDiscount(double baseSalary) {
        double exemption = calculateExemption();
        return baseSalary - exemption;
    }

    public static double calculateTaxLayer(double baseSalary) {
        if (baseSalary <= 1_903.98) {
            return 00.00;
        } else if (baseSalary <= 2_826.65) {
            return 00.075;
        } else if (baseSalary <= 3_751.05) {
            return 00.15;
        } else if (baseSalary <= 4_664.68) {
            return 00.225;
        } else {
            return 00.275;
        }
    }

    public static double calculateIrpf(double baseSalary) {
        double salaryWithoutInss = calculateBaseSalary(baseSalary);
        double salaryIrrf = calculateDiscount(salaryWithoutInss);
        double taxLayer = calculateTaxLayer(salaryWithoutInss);
        return salaryIrrf*taxLayer;
    }


}
