package Application.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacherList")
public class TeaInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="姓名")
    private String name;
    @Column(name ="性别")
    private String sex;
    @Column(name ="职位")
    private String post;
    @Column(name ="研究方向")
    private String dir;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDir() {
        return dir;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getSex() {
        return sex;
    }
}
