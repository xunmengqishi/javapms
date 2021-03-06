package com.portal.datacenter.commdata.dao;

import com.javapms.basic.hibernate3.Updater;
import com.javapms.basic.page.Pagination;
import com.portal.datacenter.commdata.entity.ForeignLang;
import java.util.List;

public abstract interface ForeignLangDao
{
  public abstract Pagination getPage(int paramInt1, int paramInt2);
  
  public abstract List<ForeignLang> getForeignLangList();
  
  public abstract ForeignLang findById(Integer paramInteger);
  
  public abstract ForeignLang save(ForeignLang paramForeignLang);
  
  public abstract ForeignLang updateByUpdater(Updater<ForeignLang> paramUpdater);
  
  public abstract ForeignLang deleteById(Integer paramInteger);
}


/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\
 * Qualified Name:     com.portal.datacenter.commdata.dao.ForeignLangDao
 * JD-Core Version:    0.7.0.1
 */