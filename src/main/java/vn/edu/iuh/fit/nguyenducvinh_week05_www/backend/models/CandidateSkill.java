package vn.edu.iuh.fit.nguyenducvinh_week05_www.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.nguyenducvinh_week05_www.backend.enums.SkillLevel;
import vn.edu.iuh.fit.nguyenducvinh_week05_www.backend.ids.CandidateSkillId;

@Getter
@Setter
@Entity
@Table(name = "candidate_skill", schema = "works")
@RequiredArgsConstructor
@NoArgsConstructor
public class CandidateSkill {
    @EmbeddedId @NonNull
    private CandidateSkillId id;

    @Column(name = "more_infos", length = 1000)
    private String moreInfos;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "skill_level", nullable = false)
    @NonNull
    private SkillLevel skillLevel;

    public CandidateSkill(@NonNull CandidateSkillId id, String moreInfos, @NonNull SkillLevel skillLevel) {
        this.id = id;
        this.moreInfos = moreInfos;
        this.skillLevel = skillLevel;
    }

    public @NonNull CandidateSkillId getId() {
        return id;
    }

    public void setId(@NonNull CandidateSkillId id) {
        this.id = id;
    }

    public String getMoreInfos() {
        return moreInfos;
    }

    public void setMoreInfos(String moreInfos) {
        this.moreInfos = moreInfos;
    }

    public @NonNull SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(@NonNull SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }
}