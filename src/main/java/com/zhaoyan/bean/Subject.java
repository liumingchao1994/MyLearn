package com.zhaoyan.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity(name = "t_subject_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "subjectname")
    private String subjectName;
    @Column(name = "createtime")
    @JsonFormat(pattern = "yyyy-MM-dd hh|mm|ss")
    private Date createTime;
    @Column(name = "updatetime")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh|mm|ss")
    private Date updateTime;


}
