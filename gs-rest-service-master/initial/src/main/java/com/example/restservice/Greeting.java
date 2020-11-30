package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;
	private final String fachLabelRisikoHeader;
	private final String fachLabelRisiko;
	private final String fachLabelFlaeche;
	
	public Greeting(long id, String content, String fachLabelRisikoHeader, String fachLabelRisiko, String fachLabelFlaeche) {
		this.id = id;
		this.content = content;
		this.fachLabelRisikoHeader = fachLabelRisikoHeader;
		this.fachLabelRisiko = fachLabelRisiko;
		this.fachLabelFlaeche = fachLabelFlaeche;
		
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}


	public String getFachLabelRisikoHeader() {
		return fachLabelRisikoHeader;
	}

	public String getFachLabelRisiko() {
		return fachLabelRisiko;
	}

	public String getFachLabelFlaeche() {
		return fachLabelFlaeche;
	}

	// public String getFachRisikoTyp(int n){
	// 	return fachRisikoTypen[n].toString();
	// }
}
// // hier jshon
//  {
// 		fach_label_risiko_header : string,
// 		fach_label_risiko 		: string,
//  	fach_label_flaeche      : string,
//   	fach_risikoTypen :[
// 		  {
// 			 	typ: string
// 		  }
// }