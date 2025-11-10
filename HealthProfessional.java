/**
 * 健康专业人员基类，封装所有健康从业者的共同属性和行为
 */
public class HealthProfessional {
    // 必需实例变量
    private int id;          // 编号（仅数字）
    private String name;     // 姓名
    // 额外相关实例变量：专业领域（所有健康从业者均具备）
    private String specialty;

    // 默认构造函数
    public HealthProfessional() {}

    // 初始化所有实例变量的构造函数
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("姓名: " + name);
        System.out.println("专业领域: " + specialty);
    }

    // Getter 和 Setter 方法（用于子类访问和修改父类属性）
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}