public class Date {
    private int month;
    private int day;
    private int year;

    private static boolean isDateTrue(int month, int day, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Mes no válido");
            return false;
        }
        if (day < 1 || day > 31) {
            System.out.println("Día no válido");
            return false;
        }
        if (year <= 0) {
            System.out.println("Año no válido");
            return false;
        }
        return true;
    }

    private static int convertirMes(String mes) {
        switch (mes.toLowerCase()) {
            case "enero": return 1;
            case "febrero": return 2;
            case "marzo": return 3;
            case "abril": return 4;
            case "mayo": return 5;
            case "junio": return 6;
            case "julio": return 7;
            case "agosto": return 8;
            case "septiembre": return 9;
            case "octubre": return 10;
            case "noviembre": return 11;
            case "diciembre": return 12;
            default: throw new IllegalArgumentException("Mes no válido");
        }
    }

    private static String nombreMes(int mes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return meses[mes - 1];
    }


    public Date(int month, int day, int year) {
        if (isDateTrue(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Fecha invalida");
        }
    }


    public Date(String month, int day, int year) {
        this(convertirMes(month), day, year);
    }


    public Date(int day, String month, int year) {
        this(convertirMes(month), day, year);
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    public void displayDate(String format) {
        switch (format) {
            case "MM/DD/YYYY":
                System.out.printf("%02d/%02d/%d\n", month, day, year);
                break;
            case "Month DD, YYYY":
                System.out.printf("%s %d, %d\n", nombreMes(month), day, year);
                break;
            case "DD Month YYYY":
                System.out.printf("%d %s %d\n", day, nombreMes(month), year);
                break;
            default:
                System.out.println("Formato no válido");
        }
    }

    public void setMonth(int month) {
        if (isDateTrue(month, this.day, this.year)) {
            this.month = month;
        } else {
            System.out.println("Fecha invalida");
        }
    }

    public void setDay(int day) {
        if (isDateTrue(this.month, day, this.year)) {
            this.day = day;
        } else {
            System.out.println("Fecha invalida");
        }
    }

    public void setYear(int year) {
        if (isDateTrue(this.month, this.day, year)) {
            this.year = year;
        } else {
            System.out.println("Fecha invalida");
        }
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }
}
