/*  1:   */ package com.portal.datacenter.commdata.entity;
/*  2:   */ 
/*  3:   */ import com.portal.datacenter.commdata.entity.base.BaseSpecialty;
/*  4:   */ 
/*  5:   */ public class Specialty
/*  6:   */   extends BaseSpecialty
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = 1L;
/*  9:   */   
/* 10:   */   public Specialty() {}
/* 11:   */   
/* 12:   */   public Specialty(Integer id)
/* 13:   */   {
/* 14:19 */     super(id);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public Specialty(Integer id, String code, String name)
/* 18:   */   {
/* 19:33 */     super(id, code, name);
/* 20:   */   }
/* 21:   */ }


/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\
 * Qualified Name:     com.portal.datacenter.commdata.entity.Specialty
 * JD-Core Version:    0.7.0.1
 */