package com.amr.project.model.entity;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Enabled
@Table(name = "mails")
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String to;
    private String from;
    private String subject;
    private String message;
}