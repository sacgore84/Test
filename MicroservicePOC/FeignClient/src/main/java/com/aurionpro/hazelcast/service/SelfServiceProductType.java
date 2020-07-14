package com.aurionpro.hazelcast.service;

public enum SelfServiceProductType {
	
	CURRENTSAVINGACCOUNT {
		@Override
		public String toString() {
			return "Current / Saving account";
		} 
	},
	BUSINESSDETAILS
	{
		@Override
		public String toString() {
			return "Business details";
		} 
	},
	
	FOREIGNDRAFT
	{
		@Override
		public String toString() {
			return "Foreign Draft";
		} 
	},
	
	
	
	CUSTOMERCHEQUEOWNCHEQUE
	{
		@Override
		public String toString() {
			return "Customer Cheque/Own Cheque";
		} 
	},
	
	CASHIERSORDER
	{
		@Override
		public String toString() {
			return "Cashier's Order";
		} 
	};

}
