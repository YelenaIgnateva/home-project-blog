package com.itacademy.blog.services.service.impl;

import com.itacademy.blog.data.entity.Post;
import com.itacademy.blog.data.entity.Tag;
import com.itacademy.blog.data.repository.PostRepo;
import com.itacademy.blog.data.repository.TagRepo;
import com.itacademy.blog.services.DTO.PostDTO;
import com.itacademy.blog.services.mapper.PostMapper;
import com.itacademy.blog.services.service.PostService;
import com.itacademy.blog.services.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepo postRepo;
    private final TagRepo tagRepo;
    private final UserService userService;

    @Override
    public PostDTO createPost(PostDTO createPostDto) {
        Post entityToCreate = PostMapper.INSTANCE.convert(createPostDto);

        arrayCheck(createPostDto.getTags());

//        entityToCreate.getTags().removeIf(tag -> tagRepo.findByName(tag.getName()).isPresent());

        for (int i = 0; i < createPostDto.getTags().size(); i++) {
            if (tagRepo.findByName(createPostDto.getTags().get(i).getName()).isPresent()) {
                entityToCreate.getTags().add(tagRepo.findByName(createPostDto.getTags().get(i).getName()).get());
            }
        }
        entityToCreate.setCreatedOn(OffsetDateTime.now());
        postRepo.save(entityToCreate);
        return PostMapper.INSTANCE.convert(entityToCreate);
    }

    public static void arrayCheck(List<Tag> array){
        HashSet<String> used = new HashSet<>();

        for(int i = 0; i < array.size(); i++){
            if(used.contains(array.get(i).getName())){
                continue;
            } else {
                used.add(array.get(i).getName());
            }

            for(int j = i + 1; j < array.size(); j++){

                if(array.get(i).getName().equals(array.get(j).getName())){
                    throw new ValidationException("Post contains a duplicate tag: " + array.get(i).getName());
                }
            }
        }
    }
}
