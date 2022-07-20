----------------------
----------------------
-- The "to do" lists
----------------------
----------------------

-- 1st "to do" list
insert into TODO_LIST (todo_list_id,name) values (1, 'Languages to learn');

-- 2nd "to do" list
insert into TODO_LIST (todo_list_id,name) values (2, 'Languages to continue learning');

-- 3rd "to do" list
insert into TODO_LIST (todo_list_id,name) values (3, 'Languages to master');

------------------------------------------
------------------------------------------
-- The actual items on the "to do" lists
------------------------------------------
------------------------------------------

-- 1st "to do" list items
insert into TODO_ITEM (todo_item_id, item, complete, todo_list_id) values (1, 'Kotlin', FALSE, 1);
insert into TODO_ITEM (todo_item_id, item, complete, todo_list_id) values (2, 'Swift', FALSE, 1);

-- 2nd "to do" list items
insert into TODO_ITEM (todo_item_id, item, complete, todo_list_id) values (3, 'Golang', TRUE, 2);

-- 3rd "to do" list items
insert into TODO_ITEM (todo_item_id, item, complete, todo_list_id) values (4, 'Java', FALSE, 3);
insert into TODO_ITEM (todo_item_id, item, complete, todo_list_id) values (5, 'Python', FALSE, 3);