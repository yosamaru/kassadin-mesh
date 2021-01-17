package com.yosamaru.batch.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccessDO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String shopName;
    private String categoryName;
    private String brandName;
    private String shopId;
    private String omit;
    private String updateTime;
    private boolean deleteStatus;
    private String createTime;
    private String description;
}
