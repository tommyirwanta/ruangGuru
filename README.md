# ruangGuru
for ruang guru test

Preparation:
1. Java installed on pc
2. Maven installed on pc
3. Intellij for editor
4. Plugin installed fro Intellij
5. Chrome for browser

How to Setup:
1. I create new project in Intellij
2. I use template project (provide by QA RnD team)

*QA RND team is the team responsible for determining the tools/versions used and help QA/SDET if there are problems in automation

3. Create web automation
4. Create API automation 

How to Run
to run this automation you need to set tag name in cucumber runner file
- @SkillAcademyAPI -> for API automation
- @SkillAcademy -> for Web automation

for ex (in cucumber runner file):
        tags = {"@SkillAcademyAPI"})
        
        
*I've tried running and all scenarios run successfully
