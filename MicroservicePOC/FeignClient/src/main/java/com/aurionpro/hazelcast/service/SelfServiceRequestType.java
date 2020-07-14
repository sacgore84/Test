package com.aurionpro.hazelcast.service;

public enum SelfServiceRequestType {
	REQUESTDUPLICATESTATEMENT {
		@Override
		public String toString() {
			return "Request duplicate statement";
		} 
	},
	ENROLLFORELECTRONICSTATEMENT{
		@Override
		public String toString() {
			return "Enroll for Electronic statement";
		} 
	},
	REQUESTBALANCECONFIRMATIONLETTER {
		@Override
		public String toString() {
			return "Request Balance confirmation letter";
		} 
	},
	UPDATETRADELICENSE {
		@Override
		public String toString() {
			return "Update Trade License";
		} 
	},
	UPDATECONTACTDETAILS {
		@Override
		public String toString() {
			return "Update Contact details";
		} 
	},
	
	REQUESTNEWDRAFT {
		@Override
		public String toString() {
			return "Request New Draft";
		} 
	},
	
	STOPPAY{
		@Override
		public String toString() {
			return "Stop Pay";
		}
		
	},
	
	REQUESTOWNCHEQUELEAVE{
		@Override
		public String toString() {
			return "Request Own Cheque Leaves";
		}
		
	},
	
	REFUND{
		
		@Override
		public String toString() {
			return "Refund";
		}
	},
	REISSUE{
		
		@Override
		public String toString() {
			return "Reissue";
		}
	}
}
