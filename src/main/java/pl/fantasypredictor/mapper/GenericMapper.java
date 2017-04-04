package pl.fantasypredictor.mapper;

import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericMapper<D, E> {

    final Class<D> dtoClass;
    final Class<E> entityClass;
    //TODO Autowire not working
    private ModelMapper modelMapper = new ModelMapper();

    public GenericMapper(Class<D> dtoClass, Class<E> entityClass) {
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    public D toDto(E entity) {
        return modelMapper.map(entity, dtoClass);
    }

    public E toEntity(D dto) {
        return modelMapper.map(dto, entityClass);
    }

    public List<D> toDtoList(final Collection<E> entities) {
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public List toEntityList(final Collection<D> dtos) {
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
