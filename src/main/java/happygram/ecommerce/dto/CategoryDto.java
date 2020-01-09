package happygram.ecommerce.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Setter
@Getter
public class CategoryDto {

    private Long idParent;

    private String title;

    private String icon;

    private String description;

}