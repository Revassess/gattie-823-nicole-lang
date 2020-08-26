--i don't know--
select "name", username from study_set
join app_user on (study_set.owner_id = app_user.user_id);
select category_name, question, answer from flashcard join category 
on (flashcard.category_id = category.category_id )