package Test;

import java.io.IOException;

import pages.TC_MMP_PAT_PROF_006;
import pages.TC_MMP_PAT_V_HIS_PA_PRES_07;
import pages.PastPrescriptionPage;
import pages.TC_MMP_PAT_LOG_004;
import pages.TC_MMP_PAT_PROF_005;
import pages.TC_MMP_URL_001;

public class Test_case {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	TC_MMP_URL_001 hp = new TC_MMP_URL_001();
	hp.patient_Click();
	Thread.sleep(3000);
	hp.P_Click();
	
	TC_MMP_PAT_LOG_004 lp = new TC_MMP_PAT_LOG_004();
	lp.login();
	
	TC_MMP_PAT_PROF_005 pph = new TC_MMP_PAT_PROF_005();
	pph.portal_HomePage();
	
	TC_MMP_PAT_PROF_006 pd = new TC_MMP_PAT_PROF_006();
	pd.patientDetails();
	
	Thread.sleep(3000);
	TC_MMP_PAT_V_HIS_PA_PRES_07 pp = new TC_MMP_PAT_V_HIS_PA_PRES_07();
	pp.viewprescription();
	
	PastPrescriptionPage ppv = new PastPrescriptionPage();
	ppv.viewPastPrescription();
		
}
}
