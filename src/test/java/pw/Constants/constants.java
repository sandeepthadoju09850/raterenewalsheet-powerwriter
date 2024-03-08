 package pw.Constants;

public class constants {
	
		
	public static String TESTDATA_PATH = "../../resources/testData/";
	public static String TESTDATA_PATH_ALT = ".//resources//testData///";
	//------------------Common QuoteNumbers sheet----------------------------------//
	public static String NewQuoteNumbersPath = "//fscorpdata.intranet.secura.net/corpdata$/COMPANY/IT/AppAutomation/DevOps/BF_AppManagedConfig/CommercialLines/powerwriter-automatedtesting-ui/NewQuoteNumbers/NewQuoteNumbers.xlsx";
	public static String sheetName = "NewQuoteNumbers";
	

	//------------------ LOB Names----------------------------------//
		public static String CU = "CU";
		public static String BP = "BP";
		public static String CP = "CP";
		public static String TC = "TC";
		public static String CA = "CA";
		public static String WC = "WC";
		public static String PM = "PM";
		public static String BL = "BL";

		//------------------ Scenario Selection Sheet Headers ----------------------------------//
		public static String LOBName = "LOB";
		public static String RegressionID = "Reg_ID";
		public static String ScenarioName = "Scenario_Name";
		public static String ExecutionStaus = "Execute";
		public static String QuoteNumber = "Quote Number";
		public static String AccountNumber= "Account Number";
		public static String CloneQuoteNumber = "CloneQuoteNumber";
		public static String CloneAccountNumber = "CloneAccountNumber";
		public static String isClonePolicyApplicable = "isClonePolicyApplicable";
		public static String UnderlyingPolicy= "UnderlyingPolicy";


	//------------------ Transaction Types ----------------------------------//
	public static String NewQuote = "NewQuote";
	public static String NewQuote1 = "NewQuote1";
	public static String ConvertToPolicy = "ConvertToPolicy";
	public static String ConvertToPolicy1 = "ConvertToPolicy1";
	public static String FlatEndorsement1 = "FlatEndorsement1";
	public static String FlatEndorsement2 = "FlatEndorsement2";
	public static String DeleteFlatEndorsement1 = "DeleteFlatEndorsement1";
	public static String ProRataEndorsement1 = "ProRataEndorsement1";
	public static String ReverseProRataEndorsement1 = "ReverseProRataEndorsement1";
	public static String ProRataEndorsement2 = "ProRataEndorsement2";
	public static String DeleteProRataEndorsement2 = "DeleteProRataEndorsement2";
	public static String AddProRataEndorsement3 = "AddProRataEndorsement3";
	public static String AmendProRataEndorsement3 = "AmendProRataEndorsement3";
	public static String QFR = "QuoteForRenewal";
	public static String ConvertQFRToPolicy = "ConvertQFRToPolicy";
	public static String AmendConvertToPolicy = "AmendConvertQFRToPolicy";
	public static String MidTermCancel = "MidTermCancel";
	public static String Cancellation = "Cancellation";
	public static String ClonePolicy = "ClonePolicy";
	public static String CloneQuote = "CloneQuote";
	public static String SearchQuote = "SearchQuote";
	public static String SearchQuote2 = "SearchQuote2";
	public static String BookClonedPolicy = "BookClonedPolicy";
	public static String Audit = "Audit";
	public static String ReviseAudit = "ReviseAudit";
	public static String ReviseQFR = "ReviseQFR";
	public static String ReviseFinalAudit1 = "ReviseFinalAudit1";
	
	
	//---------------------------- Page wise Sheet List ------------------------------------------//
	public static String Login = "Login";
	public static String Homepage = "Homepage";
	public static String ProductInfo = "Product_Info";
	public static String Producers = "Producers";
	public static String AddNamedInsured = "AddNamedInsured";
	public static String Commercial_Package = "Commercial_Package";
	public static String Commercial_Property = "Commercial_Property";
	public static String EmpPracticesLiability = "EmpPracticesLiability";
	public static String UnderwritingApproval = "UnderwritingApproval";
	public static String Dashboard_Billing = "Dashboard_Billing";
	public static String Dashboard_Forms = "Dashboard_Forms";
	public static String Dashboard_Analytics = "Dashboard_Analytics";
	public static String Dashboard_SupplementaryInfo = "Dashboard_SupplementaryInfo";
	public static String Dashboard_Actions = "Dashboard_Actions";
	public static String Dashboard_OOSE = "Dashboard_OOSE";
	public static String Premium_Summary = "Premium_Summary";
	public static String AuditDetails = "AuditDetails";
	public static String Cyber = "CyberSecurity";
	public static String CIM_Main = "CIM_Main";
	public static String CIM_Locations = "CIM_Locations";
	public static String CIM_Terrorism = "CIM_Terrorism";
	public static String CIM_HoleInOne = "CIM_HoleInOne";
	public static String MNFireSafetySurcharge = "MNFireSafetySurcharge";
	
	public static String GL_Main = "General_Liability";
	public static String GL_Location = "GL_Location";
	public static String GL_PremAndProd = "GL_Prem&Prod";
	public static String GL_SpecialEvents = "GL_SpecialEvents";
	public static String GL_Classification = "GL_Classification";
	public static String GL_LiqourLiability = "GL_LiqourLiability";
	public static String GL_LiquorLiability_Classifications = "GL_LiquorLiab_Classification";
	public static String GL_AdditionalInterest = "GL_AdditionalInterest";
	public static String GL_Optional_Provisions = "GL_Optional_Provisions";
	public static String GL_OP_Exclusion_Provisions = "GL_OP_Exclusion_Provisions";
	public static String GL_AbuseAndMolestation = "GL_SpecialityOption_AbuseAndMol";
	public static String GL_AbuseAndMolestationClassification = "GL_SpecOption_AbuseMolestationC";
	
	public static String DO_Main = "DirectorsAndOfficers";
	public static String CP_Terrorism = "CP_Terrorism";
	public static String CovAutoSymbols = "CovAutoSymbols";
	public static String GarageKeepers = "GarageKeepers";
	public static String Vehicles = "Vehicles";
	public static String ScheduleRating = "ScheduleRating";
	public static String CA_NonOwnedLiability = "NonOwnedLiability";
	public static String CA_BusinessInterruption = "BusinessInterruption";
	public static String CA_DriveAwayCollision = "DriveAwayCollision";
	public static String CA_DriveOtherCar = "DriveOtherCar";
	public static String CA_LimitedBroadenedPollutionLiability = "LimitedBroadenedPollutionLiab";
	public static String CA_AutoAdditionalInsuredWRAP = "AutoAddInsuredWrap";
	public static String CA_PickupOrDeliveryCoverage = "PickupOrDeliveryInfo";
	public static String CA_DealerExclusions = "DealerExclusions";
	public static String CA_LtdContrtactualLiability = "LtdContrtactualLiability";
	public static String CA_GeneralLiabilityExclusions = "GeneralLiabilityExclusions";
	public static String CA_ExperienceRating = "ExperienceRating";
	public static String CA_LiabilityExperienceRating = "LiabilityExperienceRating";
	public static String CA_PhysicalDamageExperienceRating = "PhysicalDamageExperienceRating";
	public static String CA_MiscellaneousOptions = "MiscellaneousOptions";
	public static String CA_LossOfUseExpenses = "LossOfUseExpenses";
	public static String CA_LeasedWorkersCoverage = "LeasedWorkersCov";
	public static String CA_OptionalProvisions = "OptionalProvisions";
	public static String CA_DriveAwayContractorsLiability = "DriveAwayContractorsLiability";
	public static String CA_FinancialResponsibilityFiling = "FinancialResponsibilityFiling";
	public static String CA_RentalVehicleCoverage = "RentalVehicleCoverage";
	public static String CA_LimitedMexicoCoverage = "LimitedMexicoCov";
	public static String CA_TrailerInterChange = "TrailerInterchange";
	public static String CAWC_AdditionalNamedInsured = "AdditionalNamedInsured";
	public static String CA_FellowEmployeeCoverage = "FellowEmployeeCoverage";
	public static String CA_NamedDriverCollison = "NamedDriverCollison";
	
	public static String CA_Year2000Endorsements = "Year2000Endorsements";
	public static String CA_RegistrationPlates = "RegistrationPlates";
	public static String CA_RepossessedAutoNone = "RepossessedAutoNone";
	public static String CA_SilicaOrSilicaRelatedDustLiabil = "SilicaOrSilicaRelatedDustLiabil";
	public static String CA_AutoBodyManufacturersaAndInstal = "AutoBodyManufacturersaAndInstal";
	public static String CA_SecuraManusript = "SecuraManusript";
	public static String CA_FungiOrBacteriaLiability = "FungiOrBacteriaLiability";
	public static String CA_ExclusionOrExcessCoverageHazard = "ExclusionOrExcessCoverageHazard";
	public static String CA_PDCoverageTypesOfAutosInterests = "PDCoverageTypesOfAutosInterests";
	public static String CA_NamedIndividualBroadened = "NamedIndividualBroadened";
	public static String CA_FuneralDirectorsMedicalPaymentC = "FuneralDirectorsMedicalPaymentC";
	public static String CA_CommAuto = "CommercialAuto";
	public static String CA_Drivers = "Drivers";
	public static String CA_AdditionalCoverages = "AdditionalCoverages";
	public static String WCLocations = "WCLocations";
	
	public static String Locations = "Locations";
	public static String WCOptionalEndorsements = "WCOptionalEndorsements";
	public static String WC000308 = "WC000308";
	public static String WC000310 = "WC000310";
	public static String WC_WorkersCompensation = "WorkersCompensation";
	public static String WC_StateInformation = "WCStateInformation";
	public static String WC_Classifications = "WCClassifications";
	public static String WC_Deductibles = "WCDeductibles";
	public static String WC_NameLocationLinking = "WCNameLocationLinking";
	public static String WC_WCRatingPeriod = "WCRatingPeriod";
	public static String WC_FinalAuditDetails = "WCFinalAuditDetails";
	public static String WC_WaiverOfSubrogation = "WCWaiverOfSubrogation";
	public static String WC_RatingOptions = "WCRatingOptions";
	public static String WC_ScheduleRating = "WCScheduleRating";
	public static String SearchQuoteNumber = "SearchQuoteNumber";

	//---------------------------- Screen Names ------------------------------------------//
	public static String CPkg = "Commercial Package";
	public static String DOPg = "Directors and Officers";
	public static String PageNm_GL = "General Liability";
	public static String PageNm_CIM = "Commercial Inland Marine";
	public static String PageNm_FineArtsFloater = "Fine Arts Floater";
	
	public static String PageNm_ProfessionLiabClaims = "Professional Liability Claims-Made";
	public static String PageNm_ScheduleRating = "Schedule Rating/IRPM";
	public static String PageNm_ExperienceRating = "Experience Rating";
	public static String PageNm_SpecialtyOption = "Specialty Option";
	public static String PageNm_CyberSecurity = "Cyber Security";
	public static String pageNm_MNFireSafetySurcharge = "MN Fire Safety Surcharge";
	
	//------------------------------ Miscellaneous -----------------------------------------//
	
	public static String Check = "Check";
	public static String Uncheck = "Uncheck";
	public static String Validate = "validate";
	public static String Validate2 = "validate2";
	public static String NA = "N/A";
	public static String Yes = "Yes";
	public static String No = "No";
	public static String Pass = "Pass";
	public static String Fail = "Fail";
	public static String Approve = "Approve";
	
	//---------------------RRS-----------------------------------------------//
	public static String RRS = "RRS";
	public static String PWPremiumsData = "PWPremiumsData";
	
	public static String Env = System.getProperty("Environment");
}
