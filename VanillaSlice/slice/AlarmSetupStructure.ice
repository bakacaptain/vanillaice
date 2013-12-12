// IDL
module ERCare {
	struct AlarmSetupStructure {
		long minVal;
		long maxVal;
		string type;
		string patID;
	};
	
	sequence<AlarmSetupStructure> AlarmSetupStructures;
};