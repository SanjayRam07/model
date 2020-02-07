package ai.elimu.model.gson.admin;

import java.util.List;
import java.util.Set;
import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.Language;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.enums.admin.ApplicationStatus;
import ai.elimu.model.gson.BaseEntityGson;

public class ApplicationGson extends BaseEntityGson {
    
    private Language language;
    
    private String packageName;
    
    private boolean infrastructural;
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;
    
    private ApplicationStatus applicationStatus;
    
    private List<ApplicationVersionGson> applicationVersions;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    
    public boolean isInfrastructural() {
        return infrastructural;
    }

    public void setInfrastructural(boolean infrastructural) {
        this.infrastructural = infrastructural;
    }

    public Set<LiteracySkill> getLiteracySkills() {
        return literacySkills;
    }

    public void setLiteracySkills(Set<LiteracySkill> literacySkills) {
        this.literacySkills = literacySkills;
    }

    public Set<NumeracySkill> getNumeracySkills() {
        return numeracySkills;
    }

    public void setNumeracySkills(Set<NumeracySkill> numeracySkills) {
        this.numeracySkills = numeracySkills;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public List<ApplicationVersionGson> getApplicationVersions() {
        return applicationVersions;
    }

    public void setApplicationVersions(List<ApplicationVersionGson> applicationVersions) {
        this.applicationVersions = applicationVersions;
    }
}
