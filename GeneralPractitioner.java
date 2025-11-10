/**
 * 全科医生子类，继承自 HealthProfessional
 * 新增独特属性：接诊上限（全科医生通常有每日接诊人数限制）
 */
public class GeneralPractitioner extends HealthProfessional {
    // 独特实例变量：每日接诊上限
    private int dailyPatientLimit;

    // 默认构造函数
    public GeneralPractitioner() {}

    // 初始化所有实例变量的构造函数（包含父类属性）
    public GeneralPractitioner(int id, String name, String specialty, int dailyPatientLimit) {
        super(id, name, specialty); // 调用父类构造函数
        this.dailyPatientLimit = dailyPatientLimit;
    }

    // 打印医生详情（包含类型和所有属性）
    public void printDoctorDetails() {
        System.out.println("=== 全科医生详情 ===");
        super.printDetails(); // 调用父类方法打印共同属性
        System.out.println("每日接诊上限: " + dailyPatientLimit);
    }

    // Getter 和 Setter 方法
    public int getDailyPatientLimit() {
        return dailyPatientLimit;
    }

    public void setDailyPatientLimit(int dailyPatientLimit) {
        this.dailyPatientLimit = dailyPatientLimit;
    }
}
