package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.eugenefe.ncm.NcmLv1Product;
import com.eugenefe.old.ColumnModel;
import com.eugenefe.qualifiers.SecondEm;

@Named
@ViewScoped
//@javax.faces.bean.ViewScoped
//@SessionScoped 
//@RequestScoped
public class NcmProductBean implements Serializable{
	
	
	@Inject 	private Logger logger;
	
	@Inject
	@SecondEm
	private EntityManager entityManager;
	
	private String query ;
	
	private NcmLv1Product selectProduct;
	
	private List<NcmLv1Product> ncmProdList;
	
	private List<NcmLv1Product> filterProdList;
	
	private List<ColumnModel> columnList = new ArrayList<ColumnModel>();
	
	@PostConstruct
	public void getFetch(){
		query = "select a from NcmLv1Product a ";
//		query = "select a from NcmLv1Product a where a.finProdId like '%KR%'";
//		query = "select a from NcmLv1Product a where a.intRate.irId =#{selectedProduct.mvId}";
		ncmProdList = entityManager.createQuery(query).getResultList();
		
//		filterProdList = ncmProdList;
		columnList.add(new ColumnModel("FinProdId", "finProdId"));
		columnList.add(new ColumnModel("FinProdNm", "finProdNm"));
		columnList.add(new ColumnModel("ProdTypeCd", "prodTypeCd"));
		columnList.add(new ColumnModel("ProdTypeNm", "prodTypeNm"));
		columnList.add(new ColumnModel("issuCorpNo", "issuCorpNo"));
		columnList.add(new ColumnModel("issuerNm", "issuerNm"));
		columnList.add(new ColumnModel("issuAmt", "issuAmt"));
		columnList.add(new ColumnModel("issuDate", "issuDate"));
		columnList.add(new ColumnModel("matDate", "matDate"));
		columnList.add(new ColumnModel("intRate", "intRate"));
		
		logger.info("Fetch : {}", ncmProdList.size());
	}

	public List<NcmLv1Product> getNcmProdList() {
		return ncmProdList;
	}

	public void setNcmProdList(List<NcmLv1Product> ncmProdList) {
		this.ncmProdList = ncmProdList;
	}

	public NcmLv1Product getSelectProduct() {
		return selectProduct;
	}

	public void setSelectProduct(NcmLv1Product selectProduct) {
		this.selectProduct = selectProduct;
	}

	public List<NcmLv1Product> getFilterProdList() {
		return filterProdList;
	}

	public void setFilterProdList(List<NcmLv1Product> filterProdList) {
		this.filterProdList = filterProdList;
	}

	public List<ColumnModel> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<ColumnModel> columnList) {
		this.columnList = columnList;
	}
	
	
	
}
