package lk.scubes.phonesAndAccessories.asset.commonAsset.model.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CivilStatus {
    MARRIED("Married"),
    UNMARRIED("Unmarried"),
    WIDOW("Widow");

    private final String civilStatus;
}
