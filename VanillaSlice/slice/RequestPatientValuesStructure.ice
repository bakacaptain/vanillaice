// IDL
module ERCare {
	struct RequestPatientValuesStructure {
		long countOfValues;
		string PatID;
	};
	sequence<RequestPatientValuesStructure> RequestPatientValuesStructures;
};