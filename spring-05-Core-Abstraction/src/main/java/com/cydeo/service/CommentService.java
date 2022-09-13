package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.proxy.EmailCommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;
    //to avoid tightly coupled we used interface - to be loosely

    //we can autowire one by one but constructor option is better

    //@AutoWired comes automatically
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
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
