import pygame
import random
import sys

# Initialize Pygame
pygame.init()

# Constants
WIDTH, HEIGHT = 800, 600
GRID_SIZE = 20
FPS = 15

# Colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
GREEN = (0, 255, 0)
RED = (255, 0, 0)

# Set up display
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Snake Game")

# Snake class
class Snake:
    def __init__(self):
        self.body = [(WIDTH // 2, HEIGHT // 2)]
        self.direction = random.choice(['UP', 'DOWN', 'LEFT', 'RIGHT'])

    def move(self):
        head_x, head_y = self.body[0]
        if self.direction == 'UP':
            new_head = (head_x, head_y - GRID_SIZE)
        elif self.direction == 'DOWN':
            new_head = (head_x, head_y + GRID_SIZE)
        elif self.direction == 'LEFT':
            new_head = (head_x - GRID_SIZE, head_y)
        elif self.direction == 'RIGHT':
            new_head = (head_x + GRID_SIZE, head_y)

        # Wrap around screen edges
        new_head = (new_head[0] % WIDTH, new_head[1] % HEIGHT)

        # Insert new head position at the beginning of the body
        self.body.insert(0, new_head)

        # Check if snake eats food
        if self.body[0] == food.position:
            food.spawn()
        else:
            self.body.pop()  # Remove the last segment of the snake

    def draw(self):
        for segment in self.body:
            pygame.draw.rect(screen, GREEN, (segment[0], segment[1], GRID_SIZE, GRID_SIZE))

    def check_collision(self):
        head_x, head_y = self.body[0]
        # Check collision with itself
        if len(self.body) != len(set(self.body)):
            return True
        return False

    def change_direction(self, new_direction):
        # Prevent the snake from reversing into itself
        if new_direction == 'UP' and self.direction != 'DOWN':
            self.direction = 'UP'
        elif new_direction == 'DOWN' and self.direction != 'UP':
            self.direction = 'DOWN'
        elif new_direction == 'LEFT' and self.direction != 'RIGHT':
            self.direction = 'LEFT'
        elif new_direction == 'RIGHT' and self.direction != 'LEFT':
            self.direction = 'RIGHT'

# Food class
class Food:
    def __init__(self):
        self.position = (random.randint(0, (WIDTH - GRID_SIZE) // GRID_SIZE) * GRID_SIZE,
                         random.randint(0, (HEIGHT - GRID_SIZE) // GRID_SIZE) * GRID_SIZE)

    def spawn(self):
        self.position = (random.randint(0, (WIDTH - GRID_SIZE) // GRID_SIZE) * GRID_SIZE,
                         random.randint(0, (HEIGHT - GRID_SIZE) // GRID_SIZE) * GRID_SIZE)

    def draw(self):
        pygame.draw.rect(screen, RED, (self.position[0], self.position[1], GRID_SIZE, GRID_SIZE))

# Game over message
def game_over():
    font = pygame.font.Font(None, 36)
    text = font.render("Game Over! Press Q to quit.", True, WHITE)
    text_rect = text.get_rect(center=(WIDTH // 2, HEIGHT // 2))
    screen.blit(text, text_rect)
    pygame.display.flip()

# Game loop
def main():
    snake = Snake()
    food = Food()
    clock = pygame.time.Clock()

    running = True
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                sys.exit()
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_UP:
                    snake.change_direction('UP')
                elif event.key == pygame.K_DOWN:
                    snake.change_direction('DOWN')
                elif event.key == pygame.K_LEFT:
                    snake.change_direction('LEFT')
                elif event.key == pygame.K_RIGHT:
                    snake.change_direction('RIGHT')

        snake.move()

        if snake.check_collision():
            game_over()
            while True:
                for event in pygame.event.get():
                    if event.type == pygame.QUIT:
                        pygame.quit()
                        sys.exit()
                    elif event.type == pygame.KEYDOWN:
                        if event.key == pygame.K_q:
                            pygame.quit()
                            sys.exit()

        screen.fill(BLACK)
        snake.draw()
        food.draw()
        pygame.display.flip()

        clock.tick(FPS)

if __name__ == '__main__':
    main()

