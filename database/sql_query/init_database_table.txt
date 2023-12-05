create database if not exists codewithsadee_portfolio;

use codewithsadee_portfolio;

create table if not exists app_users(
	app_user_id bigint primary key auto_increment,
    app_user_name varchar(210),
    app_user_email varchar(210),
    app_user_phone varchar(42),
    app_user_birthday date,
    app_user_avatar text,
    app_user_current_job varchar(36),
    app_user_login_id varchar(45),
    app_user_password varchar(255),
    app_user_facebook_link text,
    app_user_instagram_link text,
    app_user_twitter_link text,
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_addresses(
	user_address_id bigint primary key auto_increment,
    app_user_id bigint,
    user_address_level1 varchar(99),
    user_address_level2 varchar(99),
    user_address_level3 varchar(99),
    user_address_level4 varchar(99),
    user_address_detail_address varchar(420),
    foreign key (app_user_id) references app_users(app_user_id),
    delete_flag boolean,
	created_at date,
    modified_at date
);

create table if not exists user_about_me(
	user_about_me_id bigint primary key auto_increment,
    user_about_me_summary text,
    app_user_id bigint,
    foreign key (app_user_id) references app_users(app_user_id),
    delete_flag boolean,
	created_at date,
    modified_at date
);

create table if not exists user_about_me_services(
	user_about_me_service_id bigint primary key auto_increment,
    user_about_me_id bigint,
    user_about_me_serivce_title varchar(99),
    user_about_me_service_desc varchar(300),
    user_about_me_service_icon text,
    foreign key (user_about_me_id) references user_about_me(user_about_me_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_about_me_testimonials(
	user_about_me_testimonial_id bigint primary key auto_increment,
    user_about_me_id bigint,
    user_about_me_testimonial_name varchar(99),
    user_about_me_testimonial_comment text,
    user_about_me_testimonial_avatar text,
    foreign key (user_about_me_id) references user_about_me(user_about_me_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_about_me_clients(
	user_about_me_client_id bigint primary key auto_increment,
    user_about_me_id bigint,
    user_about_me_client_link text,
    user_about_me_client_image text,
    foreign key (user_about_me_id) references user_about_me(user_about_me_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_resumes(
	user_resume_id bigint primary key auto_increment,
    app_user_id bigint,
    foreign key (app_user_id) references app_users(app_user_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_resume_educations(
	user_resume_education_id bigint primary key auto_increment,
    user_resume_id bigint,
    user_resume_education_name varchar(99),
    user_resume_education_start_time varchar(36),
    user_resume_education_end_time varchar(36),
    user_resume_education_desc text,
    foreign key (user_resume_id) references user_resumes(user_resume_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_resume_experiences(
	user_resume_experience_id bigint primary key auto_increment,
    user_resume_id bigint,
    user_resume_experience_name varchar(99),
    user_resume_experience_start_time varchar(36),
    user_resume_experience_end_time varchar(36),
    user_resume_experience_desc text,
    foreign key (user_resume_id) references user_resumes(user_resume_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_resume_skills(
	user_resume_skill_id bigint primary key auto_increment,
    user_resume_id bigint,
    user_resume_skill_name varchar(36),
    user_resume_skill_percentage tinyint unsigned,
    foreign key (user_resume_id) references user_resumes(user_resume_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_portfolioes(
	user_portfolio_id bigint primary key auto_increment,
    app_user_id bigint,
    foreign key (app_user_id) references app_users(app_user_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists project_categories(
	project_category_id bigint primary key auto_increment,
    app_user_id bigint,
    project_category_name varchar(36),
    foreign key (app_user_id) references app_users(app_user_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_portfolio_projects(
	user_portfolio_project_id bigint primary key auto_increment,
    user_portfolio_id bigint,
    project_category_id bigint,
    user_portfolio_project_name varchar(36),
    user_portfolio_project_img text,
    user_portfolio_project_link text,
    foreign key (user_portfolio_id) references user_portfolioes(user_portfolio_id),
    foreign key (project_category_id) references project_categories(project_category_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists blog_categories(
	blog_category_id bigint primary key auto_increment,
    app_user_id bigint,
    blog_category_name varchar(36),
    foreign key (app_user_id) references app_users(app_user_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);

create table if not exists user_blogs(
	user_blog_id bigint primary key auto_increment,
    app_user_id bigint,
    blog_category_id bigint,
    user_blog_name varchar(36),
    user_blog_date date,
    user_blog_decs varchar(300),
    user_blog_img text,
    foreign key (app_user_id) references app_users(app_user_id),
    foreign key (blog_category_id) references blog_categories(blog_category_id),
    delete_flag boolean,
    created_at date,
    modified_at date
);















