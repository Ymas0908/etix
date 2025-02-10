package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.service.TestService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.application.FacesMessage;
//import jakarta.faces.context.FacesContext;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//import org.primefaces.event.UnselectEvent;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//@Named
//@ViewScoped
//public class TestMB implements Serializable {
//    @Getter
//    @Setter
//    private List<ContribDataTable> contribDataTables;
//    @Getter
//    @Setter
//    private ContribDataTable selectedContribDataTable;
//
//    @Inject
//    private TestService testService;
//    @Getter
//    @Setter
//    private List<String> elements;
//    @Getter
//    @Setter
//    private List<String> typeContributeurs;
//    @Getter
//    @Setter
//    private List<String> profilContributeurs;
//    @Getter
//    @Setter
//    private String[] SelectedProfilsContributeurs;
//    @Getter
//    @Setter
//    private String profilsContributeur;
//    @Getter
//    @Setter
//    private String typeContributeur;
//    @Getter
//    @Setter
//    private String[] selectedElement;
//    @Getter
//    @Setter
//    private boolean decision;
//
//
//    @PostConstruct
//    public void init() {
//        decision = true;
//        profilContributeurs = new ArrayList<>();
//        typeContributeurs = new ArrayList<>();
//        elements = new ArrayList<>();
//        elements.add("element1");
//        elements.add("element2");
//        elements.add("element3");
//        elements.add("element4");
//        elements.add("element5");
//        typeContributeurs.add("FINTECH");
//        typeContributeurs.add("TRESOR PUBLIC");
//        typeContributeurs.add("FINANCE");
//        typeContributeurs.add("MICRO");
//        typeContributeurs.add("EME");
//        typeContributeurs.add("BANQUE");
//        profilContributeurs.add("CTP");
//        profilContributeurs.add("CTT");
//        profilContributeurs.add("CTSF");
//        profilContributeurs.add("Autre");
//        contribDataTables = testService.getcontribDataTablesItems(5);
//
//    }
//
//    public void onItemUnselect(UnselectEvent event) {
//        FacesMessage msg = new FacesMessage();
//        msg.setSummary("Item unselected: " + event.getObject().toString());
//        msg.setSeverity(FacesMessage.SEVERITY_INFO);
//
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
//
//
//    public String redirectContributeurInscription() {
//        return "/inscription-contributeur/demande-inscription-contributeur?faces-redirect=true";
//
//    }
//
//    public String redirectContributeurDetails() {
//        return "/inscription-contributeur/voir-details-contributeur?faces-redirect=true";
//
//    }
//
//    public static class ContribDataTable {
//        private String dirigeantName;
//        private Integer ContribId;
//        private String contactTelephonique;
//        private String socialRaison;
//
//        public ContribDataTable(String dirigeantName, String contactTelephonique, String socialRaison) {
//            this.dirigeantName = dirigeantName;
//            this.contactTelephonique = contactTelephonique;
//            this.socialRaison = socialRaison;
//        }
//
//        public ContribDataTable() {
//        }
//
//        public Integer getContribId() {
//            return ContribId;
//        }
//
//        public void setContribId(Integer contribId) {
//            ContribId = contribId;
//        }
//
//        public String getDirigeantName() {
//            return dirigeantName;
//        }
//
//        public void setDirigeantName(String dirigeantName) {
//            this.dirigeantName = dirigeantName;
//        }
//
//        public String getContactTelephonique() {
//            return contactTelephonique;
//        }
//
//        public void setContactTelephonique(String contactTelephonique) {
//            this.contactTelephonique = contactTelephonique;
//        }
//
//        public String getSocialRaison() {
//            return socialRaison;
//        }
//
//        public void setSocialRaison(String socialRaison) {
//            this.socialRaison = socialRaison;
//        }
//
//        public ContribDataTable clone() {
//            return new ContribDataTable(getDirigeantName(), getContactTelephonique(), getSocialRaison());
//        }
//
//    }
////public void updateProfil(){
////    PrimeFaces.current().ajax().update("validationForm");
////    System.out.prIntegerln("La valeur du bouton:::"+decision);
////}
//
//}
