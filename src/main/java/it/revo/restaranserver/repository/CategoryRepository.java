package it.revo.restaranserver.repository;

import it.revo.restaranserver.entity.Category;
import it.revo.restaranserver.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@CrossOrigin("https://webs-t5iu.vercel.app")
@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
