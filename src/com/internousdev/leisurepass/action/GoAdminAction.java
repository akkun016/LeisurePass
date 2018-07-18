package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class GoAdminAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	public String execute() {
		String result = SUCCESS;

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}

	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}