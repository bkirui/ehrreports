/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ehrreports.reporting.library.indicators;

import org.openmrs.module.ehrreports.metadata.DiagnosisMetadata;
import org.openmrs.module.ehrreports.reporting.library.cohorts.Moh705bCohortQueries;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportConstants;
import org.openmrs.module.ehrreports.reporting.utils.EhrReportUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705bIndicators {

  @Autowired private Moh705bCohortQueries moh705bCohortQueries;

  @Autowired private EhrGeneralIndicator ehrGeneralIndicator;

  @Autowired private DiagnosisMetadata diagnosisMetadata;

  /**
   * Get patients who are adults and have diagnosis other than the ones listed and classified
   *
   * @return CohortIndicator
   */
  public CohortIndicator getAdultsOtherDiseasesThatAreNotClassified() {
    return ehrGeneralIndicator.getIndicator(
        "MOH705B - OTHER",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsOtherIllinessThatAreNotClassified(),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Diah */
  public CohortIndicator getAdultsWithDiarrhoea() {
    return ehrGeneralIndicator.getIndicator(
        "Diah",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getDiarrhoeaConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** */
  /** TB */
  public CohortIndicator getAdultsWithTuberclosis() {
    return ehrGeneralIndicator.getIndicator(
        "TB",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getTuberculosisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** DY */
  public CohortIndicator getAdultsWithDysentery() {
    return ehrGeneralIndicator.getIndicator(
        "Dysentery",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getDysenteryList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** cholera */
  public CohortIndicator getAdultsWithCholera() {
    return ehrGeneralIndicator.getIndicator(
        "Dysentery",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getCholeraList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** MenongococcalInfectionsList */
  public CohortIndicator getAdultsWithMenongococcalInfectionsList() {
    return ehrGeneralIndicator.getIndicator(
        "MenongococcalInfectionsList",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMenongococcalInfectionsList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** OtherMeningitis */
  public CohortIndicator getAdultsWithOtherMeningitis() {
    return ehrGeneralIndicator.getIndicator(
        "OtherMeningitis",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getOtherMeningitisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Tetanus */
  public CohortIndicator getAdultsWithTetanus() {
    return ehrGeneralIndicator.getIndicator(
        "Tetanus",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getTetanusConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Poliomyelitis */
  public CohortIndicator getAdultsWithPoliomyelitis() {
    return ehrGeneralIndicator.getIndicator(
        "Poliomyelitis",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getAcutePoliomyelitisConceptList()), // TO DO REFACTOR TO POLIO
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** ChickenPox */
  public CohortIndicator getAdultsWithChickenPox() {
    return ehrGeneralIndicator.getIndicator(
        "ChickenPox",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getChickenPoxConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Measles */
  public CohortIndicator getAdultsWithMeasles() {
    return ehrGeneralIndicator.getIndicator(
        "Measles",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMeaslesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Hepatitis */
  public CohortIndicator getAdultsWithHepatitis() {
    return ehrGeneralIndicator.getIndicator(
        "Hepatitis",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getHepatitisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Mumps */
  public CohortIndicator getAdultsWithMumps() {
    return ehrGeneralIndicator.getIndicator(
        "Mumps",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMumpsConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Fevers */
  public CohortIndicator getAdultsWithFevers() {
    return ehrGeneralIndicator.getIndicator(
        "Fevers",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getFeversConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Suspected Malaria */

  /** Confirmed malaria */

  /** MalariaInPregnancy */
  public CohortIndicator getAdultsWithMalariaInPregnancy() {
    return ehrGeneralIndicator.getIndicator(
        "Malaria In Pregnancy",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMalariaInPregnancyList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** TyphoidFever */
  public CohortIndicator getAdultsWithTyphoidFever() {
    return ehrGeneralIndicator.getIndicator(
        "Typhoid Fever",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getTyphoidFeverConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** STIs */

  /** UrinaryTractInfection */
  public CohortIndicator getAdultsWithUrinaryTractInfection() {
    return ehrGeneralIndicator.getIndicator(
        "Urinary TractInfection",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getUrinaryTractInfectionConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Bilharzia */
  public CohortIndicator getAdultsWithBilharzia() {
    return ehrGeneralIndicator.getIndicator(
        "Bilharzia",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getBilharziaConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** IntestinalWorms */
  public CohortIndicator getAdultsWithIntestinalWorms() {
    return ehrGeneralIndicator.getIndicator(
        "IntestinalWorms",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getIntestinalWormsConceptist()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Malnutrition */
  public CohortIndicator getAdultsWithMalnutrition() {
    return ehrGeneralIndicator.getIndicator(
        "Malnutrition",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getMalnutritionConceptist()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Anaemia */
  public CohortIndicator getAdultsWithAnaemia() {
    return ehrGeneralIndicator.getIndicator(
        "Anaemia",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getAnaemiaConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** EyeInfections */
  public CohortIndicator getAdultsWithEyeInfections() {
    return ehrGeneralIndicator.getIndicator(
        "EyeInfections",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getEyeInfectionsConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** OtherEyeConditions */
  public CohortIndicator getAdultsWithOtherEyeConditions() {
    return ehrGeneralIndicator.getIndicator(
        "EyeInfections",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getEyeInfectionsConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** STIs */
  public CohortIndicator getAdultsWithSexuallyTransmittedInfections() {
    return ehrGeneralIndicator.getIndicator(
        "Sexually Transmitted Infections",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getSexuallyTransmittedInfectionsConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Hypertension */
  public CohortIndicator getAdultsWithHypertension() {
    return ehrGeneralIndicator.getIndicator(
        "Hypertension",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getHypertensionConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Sexual Assault */
  public CohortIndicator getAdultsWithSexualAssault() {
    return ehrGeneralIndicator.getIndicator(
        "Sexual assault",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getSexualAssaultConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Violence related injuries */
  public CohortIndicator getAdultsWithViolenceRelatedInjuries() {
    return ehrGeneralIndicator.getIndicator(
        "Other Bites",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getViolenceRelatedInjuriesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Burns */
  public CohortIndicator getAdultsWithBurns() {
    return ehrGeneralIndicator.getIndicator(
        "Other Bites",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getBurnsConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Snake Bites */
  public CohortIndicator getAdultsWithSnakeBites() {
    return ehrGeneralIndicator.getIndicator(
        "Other Bites",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getSnakeBitesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Dog Bites */
  public CohortIndicator getAdultsWithDogBites() {
    return ehrGeneralIndicator.getIndicator(
        "Other Bites",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getDogBitesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Other Bites */
  public CohortIndicator getAdultsWithOtherBites() {
    return ehrGeneralIndicator.getIndicator(
        "Other Bites",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getOtherBitesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Diabetes */
  public CohortIndicator getAdultsWithDiabetes() {
    return ehrGeneralIndicator.getIndicator(
        "Diabetes",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getDiabetesConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Epilepsy */
  public CohortIndicator getAdultsWithEpilepsy() {
    return ehrGeneralIndicator.getIndicator(
        "Epilepsy",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getEpilepsyConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Newly Diagnosed HIV */
  public CohortIndicator getAdultsWithNewlyDiagnosedHIV() {
    return ehrGeneralIndicator.getIndicator(
        "Newly Diagnosed HIV",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getNewlyDiagnoseHivConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Brucellosis */
  public CohortIndicator getAdultsWithBrucellosis() {
    return ehrGeneralIndicator.getIndicator(
        "Brucellosis",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getBrucellosisConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Cardiovascular Condition */
  public CohortIndicator getAdultsWithCardiovascularCondition() {
    return ehrGeneralIndicator.getIndicator(
        "CardiovascularCondition",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getCardiovascularConditionConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /** Central Narvous System Condition */
  public CohortIndicator getAdultsWithOtherCentralNarvousSystemCondition() {
    return ehrGeneralIndicator.getIndicator(
        "OtherCentral Narvous System Condition",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsWhoHaveDiagnosis(
                diagnosisMetadata.getOtherCentralNarvousSytemConditionConceptList()),
            "startDate=${startDate},endDate=${endDate}"));
  }

  /**
   * Get patients who are adults and have new/revisit
   *
   * @return CohortIndicator
   */
  public CohortIndicator getNewAndRevisitPatients(EhrReportConstants.OccurenceStates state) {
    return ehrGeneralIndicator.getIndicator(
        "New or revisit patients adults",
        EhrReportUtils.map(
            moh705bCohortQueries.getNewAndRevisitsOfAdults(state), "endDate=${endDate}"));
  }

  public CohortIndicator getPatientsReferredToFacility() {
    return ehrGeneralIndicator.getIndicator(
        "Patients who are referred to this facility adults",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsReferredToFacility(),
            "startDate=${startDate},endDate=${endDate}"));
  }

  public CohortIndicator getPatientsReferredToExternalFacilities() {
    return ehrGeneralIndicator.getIndicator(
        "Children patients who are referred to external facility adults",
        EhrReportUtils.map(
            moh705bCohortQueries.getAdultsPatientsReferredFromFacility(),
            "startDate=${startDate},endDate=${endDate}"));
  }
}
