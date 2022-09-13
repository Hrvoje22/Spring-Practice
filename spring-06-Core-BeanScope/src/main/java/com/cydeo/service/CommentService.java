package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

    private final CommentRepository commentRepository; //recommended to put final so it reminds us to create constructor if we forget
    private final CommentNotificationProxy commentNotificationProxy;
    //to avoid tightly coupled we used interface - to be loosely

    //we can autowire one by one but constructor option is better

    //@AutoWired comes automatically
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //save in DB
        commentRepository.storeComment(comment);

        //send email
        commentNotificationProxy.sendComment(comment);




    }


}
