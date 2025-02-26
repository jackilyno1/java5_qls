package sof3021.ca4.nhom1.asm.qls.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "LOAI")
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class Category implements Serializable {
    @Id
    @Column(name = "MALOAI")
    private int maLoai;

    @Column(name = "TENLOAI")
    private String tenLoai;

    @OneToMany(mappedBy = "loai")
    private List<Book> books;
}
