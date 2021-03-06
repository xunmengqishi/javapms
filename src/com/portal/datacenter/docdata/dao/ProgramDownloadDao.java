package com.portal.datacenter.docdata.dao;

import com.javapms.basic.hibernate3.Updater;
import com.javapms.basic.page.Pagination;
import com.portal.datacenter.docdata.entity.ProgramDownload;

public abstract interface ProgramDownloadDao
{
  public abstract Pagination getPage(int paramInt1, int paramInt2);
  
  public abstract ProgramDownload findUnique();
  
  public abstract ProgramDownload findById(Integer paramInteger);
  
  public abstract ProgramDownload save(ProgramDownload paramProgramDownload);
  
  public abstract ProgramDownload updateByUpdater(Updater<ProgramDownload> paramUpdater);
  
  public abstract ProgramDownload deleteById(Integer paramInteger);
}


/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\
 * Qualified Name:     com.portal.datacenter.docdata.dao.ProgramDownloadDao
 * JD-Core Version:    0.7.0.1
 */